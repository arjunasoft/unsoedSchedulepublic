package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    public static void NewMataKuliah(){
    	render();
    }
    public static void BuatBaru(MataKuliah objmatkul){
    	objmatkul.SetID();
    	render(objmatkul);
    }
    public void print(){
		List DaftarMatkul=MataKuliah.findAll();
		render(DaftarMatkul);
	}


}