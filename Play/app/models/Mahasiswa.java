package models;
import play.*;
import play.db.jpa.*;
import javax.persistence.*;
import java.util.*;
import play.data.validation.*;
@Entity
public class Mahasiswa extends Model{
	public String NamaMahasiswa;
	
	public String toString(){
		return this.NamaMahasiswa;
	}
	
//	@OneToMany
//  public List<MataKuliah> Matkul;
	@ManyToOne
    public MataKuliah Matkul1;
	@ManyToOne
    public MataKuliah Matkul2;
	@ManyToOne
    public MataKuliah Matkul3;
	@ManyToOne
    public MataKuliah Matkul4;
}
