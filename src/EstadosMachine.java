public class EstadosMachine {

    public enum EstadosJuca{
        Working,
        Eating,
        Sleeping
    }

    public static void main(String[] args){
        Juca juca = new Juca();
        EstadosJuca estado = EstadosJuca.Working;

        while(true){
            switch(estado){
                case Working:
                    juca.WorkingEstado();

                    if(juca.GetFatigue() > 50){
                        estado = EstadosJuca.Sleeping;
                    }else if (juca.GetHunger() > 10){
                        estado = EstadosJuca.Eating;
                    }
                    break;
                case Eating:
                    juca.EatingEstado();


            }
        }
    }


}
