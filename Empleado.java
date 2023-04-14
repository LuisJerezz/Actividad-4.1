/**
 * Clase Empleado para representar a los empleados de una empresa.
 * 
 * @version 0.0.3
 * @since 14/04/2023
 */
package ies;

public class Empleado {
    private int emp_no;
    private String nombre;
    private String apellido;
    private String pobla;
    private String oficio;
    private Double salario;
    private Departamento dept;

    /**
     * Constructor de la clase Empleado.
     * 
     * @param emp_no   El número de empleado.
     * @param nombre   El nombre del empleado.
     * @param apellido El apellido del empleado.
     * @param pobla    La población donde vive el empleado.
     * @param oficio   El oficio del empleado.
     * @param salario  El salario del empleado.
     * @param dept     El departamento al que pertenece el empleado.
     */
    public Empleado(int emp_no, String nombre, String apellido, String pobla, String oficio,
            Double salario, Departamento dept) {
        this.emp_no = emp_no;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pobla = pobla;
        this.oficio = oficio;
        this.salario = salario;
        this.dept = dept;
    }

    /**
     * Constructor alternativo de la clase Empleado.
     * 
     * @param emp_no  El número de empleado.
     * @param nombre  El nombre del empleado.
     * @param salario El salario del empleado.
     * @param dept    El departamento al que pertenece el empleado.
     */
    public Empleado(int emp_no, String nombre, Double salario, Departamento dept) {
        this.emp_no = emp_no;
        this.nombre = nombre;
        this.salario = salario;
        this.dept = dept;
    }

    /**
     * Devuelve el número de empleado.
     * 
     * @return El número de empleado.
     */
    public int getEmp_no() {
        return emp_no;
    }

    /**
     * Establece el número de empleado.
     * 
     * @param emp_no
     */
    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    /**
     * Devuelve el nombre del empleado.
     * 
     * @return El nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del empleado.
     * 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la población donde vive el empleado.
     * 
     * @return La población donde vive el empleado.
     */
    public String getPobla() {
        return pobla;
    }

    /**
     * Establece la población donde vive el empleado.
     * 
     * @param pobla
     */
    public void setPobla(String pobla) {
        this.pobla = pobla;
    }

    /**
     * Devuelve el oficio del empleado.
     * 
     * @return El oficio del empleado.
     */
    public String getOficio() {
        return oficio;
    }

    /**
     * Establece el oficio del empleado.
     * 
     * @param oficio
     */
    public void setOficio(String oficio){
		this.oficio = oficio;
	}

	/**
     * Devuelve el salario del empleado.
     * 
     * @return El salario del empleado.
     */
	public Double getSalario() {
		return salario;
	}

	/**
	 * Establece el salario del empleado
	 * 
	 * @param salario
	 */
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	/**
	 * Devuelve el departamento del empleado
	 * 
	 * 
	 * @return el departamento del empleado
	 */
	public Departamento getDept() {
		return dept;
	}


	/**
	 * Establece el departamento del empleado
	 * 
	 * @param dept
	 */
	public void setDept(Departamento dept) {
		this.dept = dept;
	}
	

	
	public void subidasalario(Double subida) {
		salario = salario + subida;
	}
	
	private boolean comprobar(){
		if (nombre.equals("")){
			
			return false;
		}
		return true;
	}
}