/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dase.gestorcomentarios.controllers;

import com.dase.gestorcomentarios.commons.CommonController;
import com.dase.gestorcomentarios.entities.Comentarios;
import com.dase.gestorcomentarios.services.ComentariosSvc;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alexander Elias
 */

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(path = "/comentarios")
public class ComentariosController extends CommonController<Comentarios, ComentariosSvc> {
    
}
