package com.cebem.RickAndMorty.Controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cebem.RickAndMorty.Services.GameService;
import com.cebem.RickAndMorty.models.GameModel;

@Controller
public class GameController {
    
    @Autowired
    GameService gameService;

    @RequestMapping("/games")
    public String listAllGames(Model model) {
        ArrayList<GameModel> games = gameService.getAllMemes();
        model.addAttribute("misJuegos", games);
        return "gamelist";
    }

}
