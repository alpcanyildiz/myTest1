package com.emusicstore.controller;


import com.emusicstore.dao.BenimDao;
import com.emusicstore.model.Kullanici;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller


public class BenimDenememController {

//u benim dünyam pekte yaralıııı


    @Autowired
    BenimDao benimDao;

    @RequestMapping("/sen")
    public String deneme(Model model){

        Kullanici kullanici= new Kullanici();
        int i =5;
        model.addAttribute("k",kullanici);

        return "BenimDenemem";


    }



    @RequestMapping("/aha")
    public String deneme2(@ModelAttribute("k") Kullanici kullanici){

        return "BenimDenemem2";


    }


    @RequestMapping("/ahah")
    public String deneme3(Model model){
        List<Kullanici> x;
        x=benimDao.getAllKullanici();
        model.addAttribute("kullanicilar",x);
        return "BenimDenemem2";


    }




    @RequestMapping("/deleteKullanici")
    public String sil(@RequestParam("Kullaniciid") int id ,Model model){

        benimDao.silById(id);
        return "redirect:/ahah";
    }


}
