package io.hexlet.moduls;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

/**
 * ###_____ Страница модуля код из видеоролика ____###
 */
@Getter
@Setter
@ToString
public class Gamer {
    private Long id;
    private String nickname;
    private String password;

    public Gamer(Long id, String nickname, String password) {
        this.id = id;
        this.nickname = nickname;
        this.password = password;
    }

    /**
     * Переопредиление методов equals() и hashCode()
     * должен соблюдаться контракт
     * (поля для сравнения должны присутствовать в обоих методах)
      * @param a
     * @return
     */
    @Override
    public boolean equals(Object a) {
        if (this == a) return true;
        if (a == null || getClass() != a.getClass()) return false;
        Gamer gamer = (Gamer) a;
        return id.equals(gamer.id) && nickname.equals(gamer.nickname) && password.equals(gamer.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nickname, password);
    }


}
