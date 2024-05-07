class AmpouleTube: Ampoule {
    constructor() : super()
    constructor(nom: String, probaPanne: Double, etat: Int) : super(nom, probaPanne,
        etat)
    override fun intensifier() {
        allumer()
    }
    override fun diminuer() {
        eteindre()
    }
}