package com.kazales.pontointeligente.api.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Objects;

/**
 * Created by gabrielsantos on 17/09/17.
 */
public class PasswordUtils {

//    private static final Logger log = Logger.getLogger(PasswordUtils.class);


    public PasswordUtils() {
    }

    public static String gerarBCrypt(String senha) {

        if (Objects.isNull(senha)) {
            return senha;
        }
        BCryptPasswordEncoder senhaCripto = new BCryptPasswordEncoder();
        return senhaCripto.encode(senha);
    }


}
