package com.fila.fila.controllers;

import com.fila.fila.models.Usuario;
import com.fila.fila.repositories.UsuarioRepository;
import com.fila.fila.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class IndexController {
    @Autowired
    UsuarioRepository ur;
    @Autowired
    UsuarioService us;

    @RequestMapping(value = "/listaUsuario")
    public String RedirecionaLista(Model model){
        model.addAttribute("usuarios", us.list());
        return "lista";
    }
    @RequestMapping(value = "/formulario")
    public String RedirecionaFormulario(){
        return "formUsuario";
    }

//    @RequestMapping("/deletar/{id}")
//    public String deletarUsuario (@PathVariable Long id){
//        ur.delete(id);
//        return "redirect:/listaUsuario";
//    }
    @GetMapping("/salvaUsuario")
    public String salvaUsuario(Usuario usuarioSalvar, Model usuario){
        ur.save(usuarioSalvar);
        usuario.addAttribute("usuariosLista", usuario);
        return "/listaUsuario";
    }


}
