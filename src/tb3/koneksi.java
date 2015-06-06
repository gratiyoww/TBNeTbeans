package tb3;

import koneksi.SettingUI;

public class koneksi {

    public SettingUI config = new SettingUI(null, true);

    public void konekkeDatabase() {
        config.setServer("localhost");
        config.setUser("root");
        config.setPassword("");
        config.setDatabase("inventaris_kelas");
        config.makeConnect();
    }
}
