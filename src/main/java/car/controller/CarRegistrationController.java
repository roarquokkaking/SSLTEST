package car.controller;

import car.entity.Car;
import car.entity.CarImages;
import car.service.CarRegistrationService;
import driverLicense.service.ObjectStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(path="/api")
public class CarRegistrationController {
    @Autowired
    private CarRegistrationService carRegistrationService;
    @Autowired
    private ObjectStorageService objectStorageService;
    private List<String> carImagesUUID = new ArrayList<>();

    @PostMapping(path = "/cars")
    public String createCar() {
        System.out.println("CarController start");
        
        return "asd";
    }

    


}
