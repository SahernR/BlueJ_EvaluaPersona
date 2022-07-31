
/**
 * Write a description of class Persona here.
 *
 * @author (Sebastian Ahern)
 * @version (1.0)
 */
public class Persona
{
    // instance variables - replace the example below with your own
    private String nombre;
    private int edad;
    private String rangoEtario;
    private char genero;

    /**
     * Constructor for objects of class Persona
     */
    public Persona()
    {
        // initialise instance variables empty data
        this.nombre="";
        this.edad=0;
        this.rangoEtario="";
        this.genero=' ';
    }

    public Persona(String nombre, int edad, String rangoEtario, char genero)
    {
        // initialise instance variables
        this.nombre=nombre;
        this.edad=edad;
        this.rangoEtario=rangoEtario;
        this.genero=genero;
    }
    // Getter
    public String getNombre()
    {
    return this.nombre;
    }
    // Setter
    public void setNombre()
    {
    this.nombre=nombre;
    }
    // Getter
    public int getEdad()
    {
    return this.edad;
    }
    // Setter
    public void setEdad()
    {
    this.edad=edad;
    }
    // Getter
    public String getRangoEtario()
    {
    return this.rangoEtario;
    }
    // Setter
    public void setRangoEtario()
    {
    this.rangoEtario=rangoEtario;
    }
    // Getter
    public char getGenero()
    {
    return this.genero;
    }
    // Setter
    public void setGenero()
    {
    this.genero=genero;
    }
    
    public void cumplirAnios()
    {
    this.edad=this.edad+1;
    if(this.edad>=0 && this.edad<=17)
    {
    this.rangoEtario="..Niño..";
    }
    else
    {
        if(this.edad>=18 && this.edad<=30)
        {
            this.rangoEtario="..Joven..";
        }
        else
        {
            if(this.edad>=31 && this.edad<=40)
        {
            this.rangoEtario="..Adulto Joven..";
        }
        else
        {
            if(this.edad>=41 && this.edad<=50)
            {
                this.rangoEtario="..Adulto..";
            }
            else
            {
                if(this.edad>=51 && this.edad<=70)
                {
                this.rangoEtario="..Adulto Mayor..";
                }
                else
                {
                this.rangoEtario="..:: Rayos eres Indestructible ::..";
                }
            }
        }
    
        }
    }
}
}
