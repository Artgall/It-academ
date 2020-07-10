package src.HomeWork6;

/**
 * Загрузчик курса с сайта Нац. Банка
 */
public class NBRBLoader extends SiteLoader{

    public static final String CUR_OFFICIAL_RATE = "Cur_OfficialRate";
    public static final char COLON = ':';


    /**
     * Метод для запуска загрузки курса валют
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(SiteLoader.Currency currencyName) {
        return load("https://www.nbrb.by/api/exrates/rates/" + currencyName.getId(), currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     * @param content то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected double handle(String content, Currency currencyName) {
        //TODO дописываем код сюда
        int officialRateIndex = content.indexOf(CUR_OFFICIAL_RATE); //запрашивает индекс "Cur_OfficialRate"

        String substring = content.substring(officialRateIndex);//вытягивает данные начиная с "Cur_OfficialRate"
        int i = substring.indexOf(COLON); //запрашивает индекс ":"

        String value = substring.substring(i + 1, i + 7); //первое i - двоеточие + 1, второе двоеточие + 7, т.е. цифры 2.6753

        return Double.parseDouble(value); //выводит валюту (2.6753)
    }
}