package hr.databank.elbes.dao.impl;

import hr.databank.elbes.dao.IOrderDAO;
import hr.databank.elbes.dao.repo.OrderRepository;
import hr.databank.elbes.entities.Article;
import hr.databank.elbes.entities.CartItem;
import hr.databank.elbes.entities.OrderPK;
import hr.databank.elbes.entities.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@Service
public class OrderDAOImp implements IOrderDAO {
    @PersistenceContext
    private EntityManager em;

    @Autowired
    private OrderRepository orderRepo;

    @Override
    public Orders AddOrder(Orders o) {

        o.setCartItems(new ArrayList<CartItem>());

        return orderRepo.save(o);
    }

    @Override
    public Optional<Orders> findById(OrderPK orderPK) {
        return orderRepo.findById(orderPK);
    }


    @Override
    public List<Orders> getAll() {
        String hql = "select o from Orders o";
        return em.createQuery(hql).getResultList();
    }

    @Override
    public List<Orders> getOrdersByUserId(OrderPK orderPK) {
        List<Orders> lo = new ArrayList<>();
        System.out.println("*****" + getAll());
        for (Orders o : getAll()) {
            System.out.println("++++++" + o);
            System.out.println(orderPK + "------" + o.orderPK);
            if (o.orderPK.equals(orderPK)) {
                System.out.println("equals");
                lo.add(o);
            }
        }

        return lo;
    }

    public CartItem incrementQteInCart(int idUser, int idArticle) {
        CartItem cartItem = new CartItem();
        for (CartItem cart : getCartItemByUserID(idUser)) {
            if (cart.getCartItemPK().getIdArticle() == idArticle) {
                cartItem = cart;
            }

        }
        if (cartItem.getQte() < getArticleByID(idArticle).getQte()) {
            cartItem.setQte(cartItem.getQte() + 1);
            em.merge(cartItem);
        }
        return cartItem;

    }

    public CartItem decrementQteInCart(int idUser, int idArticle) {
        CartItem cartItem = new CartItem();
        for (CartItem cart : getCartItemByUserID(idUser)) {
            if (cart.getCartItemPK().getIdArticle() == idArticle) {
                cartItem = cart;
            }


        }
        ;
        if (cartItem.getQte() != 1) {
            cartItem.setQte(cartItem.getQte() - 1);
            em.merge(cartItem);
        }
        return cartItem;

    }

    @Override
    public Article getArticleByID(int idArticle) {

        return em.find(Article.class, idArticle);
    }

    @Override
    public CartItem addArticleToCartItem(int IdUser, int idArticle) {

        boolean exist = false;

        CartItem cartItem = new CartItem();
        List<CartItem> cartItemList = getCartItemByUserID(IdUser);
        for (CartItem cart : cartItemList)
            if (cart.cartItemPK.getIdArticle() == idArticle) {
                exist = true;
                cartItem = cart;

            }
        if (exist) {

            if (cartItem.getQte() < getArticleByID(idArticle).getQte()) {
                cartItem.setQte(cartItem.getQte() + 1);
                em.merge(cartItem);
            }
        } else {
            cartItem.cartItemPK.setIdArticle(idArticle);

            cartItem.cartItemPK.orderPK = getCartByUserID(IdUser).orderPK;
            cartItem.setQte(1);
            em.persist(cartItem);


        }
        return cartItem;
    }

    @Override
    public Orders getCartByUserID(int idu) {

        Query query = em.createQuery("select o from Orders o where o.orderPK.userId=:idu and o.status=false ").setParameter("idu", idu);
        return (Orders) query.getSingleResult();
    }

    @Override
    public List<CartItem> getCartItemByUserID(int idu) {
        Query query = em.createQuery("select cartItem from CartItem cartItem ,Orders orders where cartItem.cartItemPK.orderPK.userId=:idu and cartItem.cartItemPK.orderPK=orders.orderPK and orders.status=false ").setParameter("idu", idu);
        return (List<CartItem>) query.getResultList();
    }

    @Override
    public Orders SaveCartToOrder(int userId) {
        List<CartItem> cartItems = getCartItemByUserID(userId);

        Orders order = getCartByUserID(userId);
        order.setStatus(true);
        for (CartItem cartt : cartItems) {
            Article article = getArticleByID(cartt.cartItemPK.getIdArticle());
            article.setQte(article.getQte() - cartt.getQte());
            em.merge(article);
            System.out.println(article);

        }

        em.merge(order);
        Date date = new Date();
        Query query = em.createQuery("update CartItem cart set cart.cartItemPK.orderPK.dateOrder=:date   " +
                "  where  cart.cartItemPK.orderPK.userId=:userId and " +
                "cart.cartItemPK.orderPK.dateOrder=:dateorder").setParameter("userId", userId).setParameter("date", date).setParameter("dateorder", order.orderPK.getDateOrder());
        query.executeUpdate();
        Query query2 = em.createQuery("update Orders o set o.orderPK.dateOrder=:date where o=:order").setParameter("date", date).setParameter("order", order);
        query2.executeUpdate();


        return order;
    }


    public List<CartItem> deleteFromCart(int idUser, int idArticle) {
        List<CartItem> cart = getCartItemByUserID(idUser);
        for (CartItem cartitem : cart) {
            if (cartitem.getCartItemPK().getIdArticle() == idArticle) {
                em.remove(cartitem);
                cart.remove(cartitem);

                if (cart.size() == 0) {
                    cart = new ArrayList<CartItem>();
                }
                break;
            }
        }
        return cart;


    }

    @Override
    public List<CartItem> showMyOrders(int idUser) {
        Query query = em.createQuery("select cartItem from CartItem cartItem ,Orders orders where cartItem.cartItemPK.orderPK.userId=:idu and cartItem.cartItemPK.orderPK=orders.orderPK and orders.status=true ").setParameter("idu", idUser);
        return (List<CartItem>) query.getResultList();
    }


}
