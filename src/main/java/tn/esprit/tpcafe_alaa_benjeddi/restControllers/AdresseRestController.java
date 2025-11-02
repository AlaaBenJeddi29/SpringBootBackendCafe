package tn.esprit.tpcafe_alaa_benjeddi.restControllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpcafe_alaa_benjeddi.entities.Adresse;
import tn.esprit.tpcafe_alaa_benjeddi.services.adresse.IAdresseServiceImpl;

import java.util.List;
@RestController
@AllArgsConstructor
@Tag(name = "Address Management", description = "Manage customer delivery addresses with full CRUD")
@RequestMapping("adresses")
public class AdresseRestController {

    private IAdresseServiceImpl adresseService;

    @Operation(summary = "List All Addresses", description = "Retrieve all registered delivery addresses.")
    @ApiResponse(responseCode = "200", description = "Success", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Adresse.class))))
    @GetMapping
    public List<Adresse> selectAllAdresses() {
        return adresseService.selectAllAdresses();
    }

    @Operation(summary = "Create Address", description = "Add a new delivery address.")
    @PostMapping
    public Adresse addAdresse(@RequestBody @Parameter(description = "Address with street, city, postal code") Adresse adresse) {
        return adresseService.addAdresse(adresse);
    }

    @Operation(summary = "Bulk Import", description = "Import multiple addresses (data migration).")
    @PostMapping("addAdresses")
    public List<Adresse> saveAdresses(@RequestBody List<Adresse> adresses) {
        return adresseService.saveAdresses(adresses);
    }

    @Operation(summary = "Get by ID (GET)", description = "Fetch address using findById().get()")
    @GetMapping("selectById/{id}")
    public Adresse selectAdresseByIdWithGet(@PathVariable long id) {
        return adresseService.selectAdresseByIdWithGet(id);
    }

    @Operation(summary = "Get by ID (orElse)", description = "Fetch with default fallback")
    @GetMapping("selectById2")
    public Adresse selectAdresseByIdWithOrElse(@RequestParam long id) {
        return adresseService.selectAdresseByIdWithOrElse(id);
    }

    @Operation(summary = "Delete by ID", description = "Remove a specific address.")
    @DeleteMapping("deleteById/{id}")
    public void deleteAdresseById(@PathVariable long id) {
        adresseService.deleteAdresseById(id);
    }

    @Operation(summary = "Purge All", description = "Danger: Delete all addresses.")
    @DeleteMapping("deleteAll")
    public void deleteAllAdresses() {
        adresseService.deleteAllAdresses();
    }

    @Operation(summary = "Delete by Object", description = "Delete using full address object.")
    @DeleteMapping("delete")
    public void deleteAdresse(@RequestBody Adresse adresse) {
        adresseService.deleteAdresse(adresse);
    }

    @Operation(summary = "Count", description = "Total number of addresses.")
    @GetMapping("count")
    public long countingAdresses() {
        return adresseService.countingAdresses();
    }

    @Operation(summary = "Exists?", description = "Check if address ID exists.")
    @GetMapping("verify/{id}")
    public boolean verifAdresseById(@PathVariable long id) {
        return adresseService.verifAdresseById(id);
    }
}