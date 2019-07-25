package ShipsGame.maps;

import ShipsGame.model.Mast;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    private List<Mast> masts = new ArrayList<>();
    private List<Mast> shots = new ArrayList<>();

    public List<Mast> getMasts() {
        return masts;
    }

    public void setMasts(List<Mast> masts) {
        this.masts = masts;
    }

    public List<Mast> getHits() {
        return shots;
    }

    public void setHits(List<Mast> hits) {
        this.shots = hits;
    }
}
