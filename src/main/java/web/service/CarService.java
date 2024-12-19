package web.service;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;

import java.util.List;

public interface CarService {
    List<Car> index();
}
