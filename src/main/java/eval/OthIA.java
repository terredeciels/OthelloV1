package eval;

import java.util.List;
import java.util.Random;

import static oth.Oth.Coups;
import static oth.Oth.Coups.NOMOVE;

public class OthIA {

    interface fevaluation {
        Coups eval(List<Coups> lcoups);
    }

   public EvalRandom getEvalRandom(){
        return new EvalRandom();
    }

     public class EvalRandom implements fevaluation {

        @Override
        public  Coups eval(List<Coups> lcoups) {
            if (lcoups.size() != 0) return lcoups.get(new Random().nextInt(lcoups.size()));
            else return NOMOVE;
        }
    }

     class EvalMax implements fevaluation {

        @Override
        public Coups eval(List<Coups> lcoups) {
            return null;
        }
    }
}