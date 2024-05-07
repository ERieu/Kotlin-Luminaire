open class Ampoule: Eclairage {
    var nom = ""
    var probaPanne = 0.0
    var etat = 0

    constructor()

    constructor(nom: String, probaPanne: Double, etat: Int) {
        this.nom = nom
        this.probaPanne = probaPanne
        this.etat = etat
    }

    fun probaPanne(): Int {
        val alea = (0..100).random() // generated random from 0 to 10 included
        return if (alea < this.probaPanne) {
            -1
        } else 0
    }

    override fun allumer() {
        if (this.etat != -1 && this.probaPanne() != -1) {
            this.etat = 10;
        } else {
            this.etat = -1;
        }
    }

    override fun eteindre() {
        if (this.etat != -1) {
            this.etat = 0;
        }
    }

    override fun intensifier() {
        this.etat = 0
    }
    override fun diminuer() {
        this.etat = 0
    }

    override fun etat(): Int = this.etat

    override fun toString(): String {
        return this.javaClass.name + " : " + this.etat
    }
}