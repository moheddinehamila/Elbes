package hr.databank.elbes.entities;

public class Panier {

    public int UserId;
    private Long idArticle;
    private int qte;
    private float prixtotal;

    public Panier(int userId, Long idArticle, int qte, float prixtotal) {
        UserId = userId;
        this.idArticle = idArticle;
        this.qte = qte;
        this.prixtotal = prixtotal;
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
}
