package solver;


class GaussQuadTable {

    public static final double[][] POINTS = {
        {},
        {
             0
        },
        {
            -0.577350269189625764509148780501957455647601751270126876018602326,
             0.577350269189625764509148780501957455647601751270126876018602326,
        },
        {
             0,
            -0.774596669241483377035853079956479922166584341058318165317514753,
             0.774596669241483377035853079956479922166584341058318165317514753,
        },
        {
            -0.339981043584856264802665759103244687200575869770914352592953976,
             0.339981043584856264802665759103244687200575869770914352592953976,
            -0.861136311594052575223946488892809505095725379629717637615721920,
             0.861136311594052575223946488892809505095725379629717637615721920,
        },
        {
             0,
            -0.538469310105683091036314420700208804967286606905559956202231627,
             0.538469310105683091036314420700208804967286606905559956202231627,
            -0.906179845938663992797626878299392965125651910762530862873762286,
             0.906179845938663992797626878299392965125651910762530862873762286,
        },
        {
             0.661209386466264513661399595019905347006448564395170070814526705,
            -0.661209386466264513661399595019905347006448564395170070814526705,
            -0.238619186083196908630501721680711935418610630140021350181395164,
             0.238619186083196908630501721680711935418610630140021350181395164,
            -0.932469514203152027812301554493994609134765737712289824872549616,
             0.932469514203152027812301554493994609134765737712289824872549616,
        },
        {
             0,
             0.405845151377397166906606412076961463347382014099370126387043251,
            -0.405845151377397166906606412076961463347382014099370126387043251,
            -0.741531185599394439863864773280788407074147647141390260119955351,
             0.741531185599394439863864773280788407074147647141390260119955351,
            -0.949107912342758524526189684047851262400770937670617783548769103,
             0.949107912342758524526189684047851262400770937670617783548769103,
        },
        {
            -0.183434642495649804939476142360183980666757812912973782317188473,
             0.183434642495649804939476142360183980666757812912973782317188473,
            -0.525532409916328985817739049189246349041964243120392857750857099,
             0.525532409916328985817739049189246349041964243120392857750857099,
            -0.796666477413626739591553936475830436837171731615964832070170295,
             0.796666477413626739591553936475830436837171731615964832070170295,
            -0.960289856497536231683560868569472990428235234301452038271639777,
             0.960289856497536231683560868569472990428235234301452038271639777,
        },
        {
             0,
            -0.836031107326635794299429788069734876544106718124675996104371979,
             0.836031107326635794299429788069734876544106718124675996104371979,
            -0.968160239507626089835576202903672870049404800491925329550023311,
             0.968160239507626089835576202903672870049404800491925329550023311,
            -0.324253423403808929038538014643336608571956260736973088827047476,
             0.324253423403808929038538014643336608571956260736973088827047476,
            -0.613371432700590397308702039341474184785720604940564692872812942,
             0.613371432700590397308702039341474184785720604940564692872812942,
        }
    };

    public static final double[][] WEIGHTS = {
        {}, 
        {
            2,
        },
        {
            1,
            1,
        },
        {
            0.8888888888888888888888888888888888888888888888888888888888888888,
            0.5555555555555555555555555555555555555555555555555555555555555555,
            0.5555555555555555555555555555555555555555555555555555555555555555,
        },
        {
            0.6521451548625461426269360507780005927646513041661064595074706804,
            0.6521451548625461426269360507780005927646513041661064595074706804,
            0.3478548451374538573730639492219994072353486958338935404925293195,
            0.3478548451374538573730639492219994072353486958338935404925293195,
        },
        {
            0.5688888888888888888888888888888888888888888888888888888888888888,
            0.4786286704993664680412915148356381929122955533431415399727276673,
            0.4786286704993664680412915148356381929122955533431415399727276673,
            0.2369268850561890875142640407199173626432600022124140155828278882,
            0.2369268850561890875142640407199173626432600022124140155828278882,
        },
        {
            0.3607615730481386075698335138377161116615218927467454822897392402,
            0.3607615730481386075698335138377161116615218927467454822897392402,
            0.4679139345726910473898703439895509948116556057692105353116253199,
            0.4679139345726910473898703439895509948116556057692105353116253199,
            0.1713244923791703450402961421727328935268225014840439823986354397,
            0.1713244923791703450402961421727328935268225014840439823986354397,
        },
        {
            0.4179591836734693877551020408163265306122448979591836734693877551,
            0.3818300505051189449503697754889751338783650835338627347510834510,
            0.3818300505051189449503697754889751338783650835338627347510834510,
            0.2797053914892766679014677714237795824869250652265987645370140326,
            0.2797053914892766679014677714237795824869250652265987645370140326,
            0.1294849661688696932706114326790820183285874022599466639772086387,
            0.1294849661688696932706114326790820183285874022599466639772086387,
        },
        {
            0.3626837833783619829651504492771956121941460398943305405248230675,
            0.3626837833783619829651504492771956121941460398943305405248230675,
            0.3137066458778872873379622019866013132603289990027349376902639450,
            0.3137066458778872873379622019866013132603289990027349376902639450,
            0.2223810344533744705443559944262408844301308700512495647259092892,
            0.2223810344533744705443559944262408844301308700512495647259092892,
            0.1012285362903762591525313543099621901153940910516849570590036980,
            0.1012285362903762591525313543099621901153940910516849570590036980,
        },
        {
            0.3302393550012597631645250692869740488788107835726883345930964978,
            0.1806481606948574040584720312429128095143378217320404844983359064,
            0.1806481606948574040584720312429128095143378217320404844983359064,
            0.0812743883615744119718921581105236506756617207824107507111076768,
            0.0812743883615744119718921581105236506756617207824107507111076768,
            0.3123470770400028400686304065844436655987548612619046455540111655,
            0.3123470770400028400686304065844436655987548612619046455540111655,
            0.2606106964029354623187428694186328497718402044372999519399970021,
            0.2606106964029354623187428694186328497718402044372999519399970021,
        },
    };
    
    public static final int MAX_N = POINTS.length - 1;
}
