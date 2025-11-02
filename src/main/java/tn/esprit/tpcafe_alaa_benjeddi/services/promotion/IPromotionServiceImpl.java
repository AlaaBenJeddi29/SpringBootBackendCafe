package tn.esprit.tpcafe_alaa_benjeddi.services.promotion;

import tn.esprit.tpcafe_alaa_benjeddi.entities.Promotion;
import java.util.List;

public interface IPromotionServiceImpl {

    Promotion addPromotion(Promotion promotion);
    List<Promotion> savePromotions(List<Promotion> promotions);
    Promotion selectPromotionByIdWithGet(long id);
    Promotion selectPromotionByIdWithOrElse(long id);
    List<Promotion> selectAllPromotions();
    void deletePromotionById(long id);
    void deleteAllPromotions();
    void deletePromotion(Promotion promotion);
    long countingPromotions();
    boolean verifPromotionById(long id);
}