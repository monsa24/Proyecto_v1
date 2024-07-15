package com.proyecto.controller;


import com.proyecto.domain.Perrito;
import com.proyecto.service.PerritoService;
//import com.tienda.service.impl.FirebaseStorageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j
@RequestMapping("/perrito")

public class PerritoController {

    @Autowired
    private PerritoService perritoService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var perritos = perritoService.getPerritos(false);
        model.addAttribute("perritos", perritos);
        model.addAttribute("totalPerritos", perritos.size());
        //crear URL local host
        return "/perrito/listado";
        //finalizando el controlador para la lista
    }

    @GetMapping("/nuevo")
    public String categoriaNuevo(Perrito perrito) {
        return "/perrito/modifica";
    }

//    @Autowired
//    private FirebaseStorageServiceImpl firebaseStorageService;

 

 
}
