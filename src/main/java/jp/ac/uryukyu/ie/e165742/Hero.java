package jp.ac.uryukyu.ie.e165742;

/**
 * Created by e165742 on 2016/11/16.
 */
/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Hero extends LivingThing {

    public Hero(String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);
    }

    @Override
    public void wounded(int damage) {
        setHitPoint(getHitPoint()-damage);
        if (getHitPoint() < 0) {
            setDead(true);
            System.out.printf("勇者%sは倒れた。\n", getName());
        }
    }
}
