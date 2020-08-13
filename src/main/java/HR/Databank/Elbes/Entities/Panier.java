package HR.Databank.Elbes.Entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Panier {

    public int UserId;
    private Long idArticle;
    private int qte;
    private float prixtotal;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int PanierId;

    public Panier(int userId, Long idArticle, int qte, float prixtotal , int PanierId) {
        UserId = userId;
        this.idArticle = idArticle;
        this.qte = qte;
        this.prixtotal = prixtotal;
        this.PanierId=PanierId;
    }
    public Panier() {
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public Long getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(Long idArticle) {
        this.idArticle = idArticle;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public float getPrixtotal() {
        return prixtotal;
    }

    public void setPrixtotal(float prixtotal) {
        this.prixtotal = prixtotal;
    }
    public int getPanierId() {
        return PanierId;
    }

    public void setPanierId(int panierId) {
        this.PanierId = panierId;
    }
}
