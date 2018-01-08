package models;

import play.*;
import play.db.jpa.*;
import javax.persistence.*;
import java.util.*;
import play.data.validation.*;
@Entity
public class MataKuliah extends Model {
	public String Nama;
	public static int ID;
	@ManyToOne
	public Dosen Dosennya;
	public void SetID(){
		ID++;
	}

}
