package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Binary extends Controller {

    public static void index() {
        render();
    }
    
    public static void save(UserWithAvatar user) {
        user.save();
        show(user.id);
    }
    
    public static void show(Long id) {
        UserWithAvatar user = UserWithAvatar.findById(id);
        render(user);
    }
    
    public static void showAvatar(Long id) {
        UserWithAvatar user = UserWithAvatar.findById(id);
        if(user.avatar.isSet()) {
            renderBinary(user.avatar.get());
        }
        notFound();
    }
    
}

