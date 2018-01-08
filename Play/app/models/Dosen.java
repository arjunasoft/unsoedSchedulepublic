package models;
import play.*;
import play.db.jpa.*;
import javax.persistence.*;
import java.util.*;
import play.data.validation.*;
@Entity
public class Dosen extends Model{
	public String NamaDosen;
	
	public String toString(){
		return this.NamaDosen;
	}

}
