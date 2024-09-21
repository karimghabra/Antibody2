Thyrosim.java:
When starting the program, run here.
    Thryosim(...):
        Initializes parameters and plotters

    ComputeDerivatives(...):
        Recieves double t, double[] q, double[] qDot
        Calculates all variables used for pThyrosim
        personalize(...) is not implimented in here yet

    personalize(...):
        Receives boolean sex, double height, double BW
        Recalculates a new Vp, Vtsh, and k05 for personalized Thyrosim models
        Prints the new values

    plotAll():
        plots t3, t4, and TSH graphs

    main(...):
        Receives every necessary variable for the program (list can be found in launch.json under args:)
        Initializes, calculates, and plots the Thryosim models

Launch.json:
    Change the args to modify the inputs.

If you can't run the Java program, see HowToFix.txt.