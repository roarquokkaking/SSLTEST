package login.service;

import jakarta.servlet.http.HttpSession;
import login.dto.LoginDTO;

public interface KakaoLoginService {
    void kakaoLogin(String code, HttpSession session);
    String isExistId(String id);
    void insertUser(LoginDTO loginDTO);


}
