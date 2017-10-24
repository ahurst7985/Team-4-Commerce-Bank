package com.Encryption.controller;

import com.Encryption.entity.Crypto;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@RestController
@RequestMapping("/crypto")
public class CryptoController {

    private Crypto crypto;

    @RequestMapping(value = "cryptoButton", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("index", "crypto", new Crypto());
    }

    @RequestMapping(value="/result", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("crypto")Crypto crypto, BindingResult result, ModelMap model) {

        if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("");
        return "result";
    }
}
