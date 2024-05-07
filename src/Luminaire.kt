class Luminaire : Eclairage {
    val ampoule1 = AmpouleIncandescente()
    val ampoule2 = AmpouleIncandescente()
    val ampoule3 = AmpouleIncandescente()
    val ampoule4 = AmpouleIncandescente()

    constructor()

    override fun allumer() {
        ampoule1.allumer()
        ampoule2.allumer()
        ampoule3.allumer()
        ampoule4.allumer()
    }

    override fun eteindre() {
        ampoule1.eteindre()
        ampoule2.eteindre()
        ampoule3.eteindre()
        ampoule4.eteindre()
    }

    override fun intensifier() {
        ampoule1.intensifier()
        ampoule2.intensifier()
        ampoule3.intensifier()
        ampoule4.intensifier()
    }

    override fun diminuer() {
        ampoule1.diminuer()
        ampoule2.diminuer()
        ampoule3.diminuer()
        ampoule4.diminuer()
    }

    override fun etat(): Int {
        var etat: Int
        etat = ampoule1.etat()
        if (ampoule2.etat() > etat) {
            etat = ampoule2.etat()
        }
        if (ampoule3.etat() > etat) {
            etat = ampoule3.etat()
        }
        if (ampoule4.etat() > etat) {
            etat = ampoule4.etat()
        }
        return etat
    }

    override fun toString(): String {
        return """Etat du luminaire :
            ${ampoule1}
            ${ampoule2}
            ${ampoule3}
            ${ampoule4}
        """
    }
}