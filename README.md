# Demo for issue 222826

When Observable field declared as static final that breaks binding - only initial value is used, but not bind new value after changes.

    public static final ObservableField<String> finalVar = new ObservableField<>(); // not works
    public static /*final*/ ObservableField<String> nonFinalVar = new ObservableField<>(); // works perfectly
