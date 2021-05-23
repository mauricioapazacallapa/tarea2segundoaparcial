



   public class tarea2
{
    private int [] notasEstudiantes;
    int siguientePosLibre;
    int cantAprobados;
    int cantReprobados;
    int notaMasAlta;
    public tarea2(int cant){
        siguientePosLibre=0;
        cantAprobados=0;
        cantReprobados=0;
        notaMasAlta=0;
        notasEstudiantes = new int[cant];
        for(int i = 0; i<cant; i++){
            notasEstudiantes[i]=0;
        }
        
    }
    
    public void añadirNotas(int nota){
        if(siguientePosLibre < notasEstudiantes.length){
            notasEstudiantes[siguientePosLibre]= nota;
            siguientePosLibre++;
        }
    }
  
    
    public int promedioNotas(){
        int suma=0;
        for(int i = 0; i<notasEstudiantes.length; i++){
            suma = suma + notasEstudiantes[i];
        }
        return suma/notasEstudiantes.length;
    }
    
    public int promedioNotasAprobadas(){
        int suma=0;
        int contador=0;
        for(int i = 0; i<notasEstudiantes.length; i++){
            if(notasEstudiantes[i]>51){
               suma = suma + notasEstudiantes[i]; 
               contador++;
            }
        }
        return suma/contador;
    }
    
    public int cantNotasAprobadas(){
        for(int i = 0; i<notasEstudiantes.length; i++){
            if(notasEstudiantes[i]>51){
                cantAprobados++;
            }
        }
        return cantAprobados;
    }
    
    public int cantNotasReprobados(){
        for(int i = 0; i<notasEstudiantes.length; i++){
            if(notasEstudiantes[i]<=51){
                cantReprobados++;
            }
        }
        return cantReprobados;
    }
    
    public String notaMasAlta(){
        int notaMasAlta=0;
        for(int i = 0; i<notasEstudiantes.length; i++){
            if(notasEstudiantes[i]>notaMasAlta){
                notaMasAlta = notasEstudiantes[i];
            }
        }
        return "la nota mas alta es: "+notaMasAlta;
    }
}

   