package tn.esprit.tpcafe_alaa_benjeddi.restControllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpcafe_alaa_benjeddi.entities.Promotion;
import tn.esprit.tpcafe_alaa_benjeddi.services.promotion.IPromotionServiceImpl;

import java.util.List;
@RestController
@AllArgsConstructor
@Tag(name = "Promotions & Discounts", description = "Manage special offers and flash sales")
@RequestMapping("promotions")
public class PromotionRestController {

    private IPromotionServiceImpl promotionService;

    @Operation(summary = "List All Promotions", description = "View all promotions.")
    @GetMapping
    public List<Promotion> selectAllPromotions() {
        return promotionService.selectAllPromotions();
    }

    @Operation(summary = "Create Promotion", description = "Launch new discount.")
    @PostMapping
    public Promotion addPromotion(@RequestBody Promotion promotion) {
        return promotionService.addPromotion(promotion);
    }

    @Operation(summary = "Bulk Import", description = "Import multiple promotions.")
    @PostMapping("addPromotions")
    public List<Promotion> savePromotions(@RequestBody List<Promotion> promotions) {
        return promotionService.savePromotions(promotions);
    }

    @Operation(summary = "Get by ID (GET)", description = "Fetch using findById().get()")
    @GetMapping("selectById/{id}")
    public Promotion selectPromotionByIdWithGet(@PathVariable long id) {
        return promotionService.selectPromotionByIdWithGet(id);
    }

    @Operation(summary = "Get by ID (orElse)", description = "Fetch with null fallback")
    @GetMapping("selectById2")
    public Promotion selectPromotionByIdWithOrElse(@RequestParam long id) {
        return promotionService.selectPromotionByIdWithOrElse(id);
    }

    @Operation(summary = "Delete by ID", description = "Remove promotion.")
    @DeleteMapping("deleteById/{id}")
    public void deletePromotionById(@PathVariable long id) {
        promotionService.deletePromotionById(id);
    }

    @Operation(summary = "Purge All", description = "Delete all promotions.")
    @DeleteMapping("deleteAll")
    public void deleteAllPromotions() {
        promotionService.deleteAllPromotions();
    }

    @Operation(summary = "Delete by Object", description = "Delete using full promotion object.")
    @DeleteMapping("delete")
    public void deletePromotion(@RequestBody Promotion promotion) {
        promotionService.deletePromotion(promotion);
    }

    @Operation(summary = "Count", description = "Total number of promotions.")
    @GetMapping("count")
    public long countingPromotions() {
        return promotionService.countingPromotions();
    }

    @Operation(summary = "Exists?", description = "Check if promotion ID exists.")
    @GetMapping("verify/{id}")
    public boolean verifPromotionById(@PathVariable long id) {
        return promotionService.verifPromotionById(id);
    }
}