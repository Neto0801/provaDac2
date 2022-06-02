package variaveis;

import java.util.Date;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Jogovar {

	
	Random generico = new Random();
	@Id
	@GeneratedValue
	private Integer id;
	@Column(nullable = false)
	private String comentario;
	@Temporal(TemporalType.DATE)
	private Date datadodia = new Date();



	Integer v1 = generico.nextInt(31);
	
	Integer v2 = generico.nextInt(31);
	
	Integer v3 = generico.nextInt(31);
	
	Integer v4 = generico.nextInt(31);
	
	Integer v5 = generico.nextInt(31);
	
	Integer v6 = generico.nextInt(31);
	
	Integer v7 = generico.nextInt(31);
	
	Integer v8 = generico.nextInt(31);
	
	Integer v9 = generico.nextInt(31);
	
	Integer v10 = generico.nextInt(31);
	
	public Integer getV1() {
		return v1;
	}

	public void setV1(Integer v1) {
		this.v1 = v1;
	}

	public Integer getV2() {
		return v2;
	}

	public void setV2(Integer v2) {
		this.v2 = v2;
	}

	public Integer getV3() {
		return v3;
	}

	public void setV3(Integer v3) {
		this.v3 = v3;
	}

	public Integer getV4() {
		return v4;
	}

	public void setV4(Integer v4) {
		this.v4 = v4;
	}

	public Integer getV5() {
		return v5;
	}

	public void setV5(Integer v5) {
		this.v5 = v5;
	}

	public Integer getV6() {
		return v6;
	}

	public void setV6(Integer v6) {
		this.v6 = v6;
	}

	public Integer getV7() {
		return v7;
	}

	public void setV7(Integer v7) {
		this.v7 = v7;
	}

	public Integer getV8() {
		return v8;
	}

	public void setV8(Integer v8) {
		this.v8 = v8;
	}

	public Integer getV9() {
		return v9;
	}

	public void setV9(Integer v9) {
		this.v9 = v9;
	}

	public Integer getV10() {
		return v10;
	}

	public void setV10(Integer v10) {
		this.v10 = v10;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Date getDatadodia() {
		return datadodia;
	}

	public void setDatadodia(Date datadodia) {
		this.datadodia = datadodia;
	}

	
	
	
	
	
}
