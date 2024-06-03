package login.controller;

import jakarta.servlet.http.HttpSession;
import login.dto.LoginDTO;
import login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@CrossOrigin(origins="http://localhost:3000")    // 다른 포트에서 넘오는 것을 받을 수 있다.
@RestController
@RequestMapping(path = "login", produces = "application/json")
public class LoginController {

    @Autowired
    LoginService loginService;


    @GetMapping(path = "google")
    public RedirectView google(@RequestParam String code, HttpSession session){
        loginService.googleLogin(code, session );
        LoginDTO loginDTO = (LoginDTO) session.getAttribute("loginDTO");
        String id = URLEncoder.encode(loginDTO.getId(), StandardCharsets.UTF_8);
        String email = URLEncoder.encode(loginDTO.getEmail(), StandardCharsets.UTF_8);
        String name = URLEncoder.encode(loginDTO.getName(), StandardCharsets.UTF_8);
        boolean driver = loginDTO.isDriver();
        String url="http://localhost:3000/login/Google?id="+id+"&email="+email+"&name="+name+"&driver="+driver;
        return new RedirectView(url);
    }

}
