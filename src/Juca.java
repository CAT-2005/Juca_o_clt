public class Juca {
    private static final int FatigueMax = 50;
    private static final int HungerMax = 10;

    private EstadosMachine.EstadosJuca EstadoAtual;

    int fatigue = FatigueMax;
    int hunger = HungerMax;

    public void WorkingEstado(){
        EstadoAtual = EstadosMachine.EstadosJuca.Working;
        System.out.println("Hora de ir para o trabalho!...");
        fatigue += 5;
        hunger += 2;
    }

    public void EatingEstado(){
        EstadoAtual = EstadosMachine.EstadosJuca.Eating;
        System.out.println("Bateu uma fome...");
        hunger -= 5;
    }

    public void ExitEating(){
        System.out.println("Ufa! Já estou cheio...");
    }

    public void SleepingEstado(){
        EstadoAtual = EstadosMachine.EstadosJuca.Sleeping;
        System.out.println("Bateu um sono...");
        fatigue -= 10;
        hunger += 1;
    }

    public int GetFatigue(){return fatigue;}

    public int GetHunger(){return hunger;}

    public EstadosMachine.EstadosJuca GetEstadoAtual(){ return EstadoAtual; }

    public void InfoPrint(){
        System.out.println(EstadoAtual);
        System.out.println("Fome: " + hunger);
        System.out.println("Cansaço: " + fatigue);
    }
}