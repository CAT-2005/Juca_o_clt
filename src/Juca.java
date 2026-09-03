public class Juca {

    private EstadosMachine.EstadosJuca EstadoAtual;

    int fatigue = 0;
    int hunger = 0;
    boolean message = true;

    public void WorkingEstado(){
        EstadoAtual = EstadosMachine.EstadosJuca.Working;
        fatigue += 5;
        hunger += 2;
    }

    public void EatingEstado(){
        EstadoAtual = EstadosMachine.EstadosJuca.Eating;
        hunger -= 5;
    }

    public void EnterWorking(){
        System.out.println("Hora de ir para o trabalho!...\n");
    }

    public void EnterEating(){
        System.out.println("Bateu uma fome...\n");
    }

    public void ExitEating(){
        System.out.println("Ufa! Já estou cheio...\n");
    }

    public void EnterSleeping(){
        System.out.println("Bateu um sono...\n");
    }

    public void SleepingEstado(){
        EstadoAtual = EstadosMachine.EstadosJuca.Sleeping;
        fatigue -= 10;
        hunger += 1;
    }

    public int GetFatigue(){return fatigue;}

    public int GetHunger(){return hunger;}

    public void InfoPrint(){
        System.out.println(EstadoAtual);
        System.out.println("Fome: " + hunger);
        System.out.println("Cansaço: " + fatigue);
    }
}