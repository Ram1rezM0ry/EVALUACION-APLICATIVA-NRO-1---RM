package com.example.EA1_RM.controller;

import com.example.EA1_RM.model.Productos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductosController {

    @GetMapping("/productos-form")
    public String showProductForm(Model model) {
        model.addAttribute("productos", new Productos());
        return "productos-form"; // Nombre de la vista para el formulario
    }

    @PostMapping("/submit-productos")
    public String submitProductForm(@ModelAttribute Productos productos, Model model) {
        model.addAttribute("productos", productos);
        return "productos-success"; // Nombre de la vista para la pantalla de éxito
    }
}
