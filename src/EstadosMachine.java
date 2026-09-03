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
            switch(estado) {
                case Working:
                    juca.WorkingEstado();

                    if(juca.message){
                        juca.EnterWorking();
                    }

                    juca.message = false;

                    if (juca.GetFatigue() > 50) {
                        juca.message = true;
                        estado = EstadosJuca.Sleeping;
                    } else if (juca.GetHunger() > 10) {
                        juca.message = true;
                        estado = EstadosJuca.Eating;
                    }
                    break;
                case Eating:
                    juca.EatingEstado();

                    if(juca.message){
                        juca.EnterEating();
                    }

                    juca.message = false;

                    if (juca.GetHunger() <= 0) {
                        juca.message = true;
                        juca.hunger = 0;
                        juca.ExitEating();
                        estado = EstadosJuca.Working;
                    }
                    break;

                case Sleeping:
                    juca.SleepingEstado();

                    if(juca.message){
                        juca.EnterSleeping();
                    }

                    juca.message = false;

                    if (juca.GetFatigue() <= 0) {
                        juca.message = true;
                        juca.fatigue = 0;
                        estado = EstadosJuca.Working;
                    }
                    break;
            }
            System.out.println("--------------------------");
            juca.InfoPrint();
            System.out.println("--------------------------\n");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
