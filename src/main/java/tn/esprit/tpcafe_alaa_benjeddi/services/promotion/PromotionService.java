package tn.esprit.tpcafe_alaa_benjeddi.services.promotion;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpcafe_alaa_benjeddi.entities.Promotion;
import tn.esprit.tpcafe_alaa_benjeddi.repositories.PromotionRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PromotionService implements IPromotionServiceImpl {

    private final PromotionRepository promotionRepository;

    @Override
    public Promotion addPromotion(Promotion promotion) {
        return promotionRepository.save(promotion);
    }

    @Override
    public List<Promotion> savePromotions(List<Promotion> promotions) {
        return promotionRepository.saveAll(promotions);
    }

    @Override
    public Promotion selectPromotionByIdWithGet(long id) {
        return promotionRepository.findById(id).get();
    }

    @Override
    public Promotion selectPromotionByIdWithOrElse(long id) {
        return promotionRepository.findById(id).orElse(null);
    }

    @Override
    public List<Promotion> selectAllPromotions() {
        return promotionRepository.findAll();
    }

    @Override
    public void deletePromotionById(long id) {
        promotionRepository.deleteById(id);
    }

    @Override
    public void deleteAllPromotions() {
        promotionRepository.deleteAll();
    }

    @Override
    public void deletePromotion(Promotion promotion) {
        promotionRepository.delete(promotion);
    }

    @Override
    public long countingPromotions() {
        return promotionRepository.count();
    }

    @Override
    public boolean verifPromotionById(long id) {
        return promotionRepository.existsById(id);
    }
}