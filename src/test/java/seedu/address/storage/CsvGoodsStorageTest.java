package seedu.address.storage;



import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import seedu.address.commons.exceptions.DataLoadingException;
import seedu.address.model.goodsReceipt.GoodsReceipt;

public class CsvGoodsStorageTest {

    @TempDir
    public Path testFolder;

    private CsvGoodsStorage csvGoodsStorage;
    private Path filePath;

    @BeforeEach
    public void setUp() {
        filePath = testFolder.resolve("TempGoods.csv");
        csvGoodsStorage = new CsvGoodsStorage(filePath);
    }

    @Test
    public void saveGoods_nullGoods_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> csvGoodsStorage.saveGoods(null, filePath));
    }

    @Test
    public void saveGoods_nullFilePath_throwsNullPointerException() {
        // TODO: Implement this
    }

    @Test
    public void saveGoods_validGoods_success() throws IOException {

    }

    @Test
    public void readGoods_nullFilePath_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> csvGoodsStorage.readGoods(null));
    }

    @Test
    public void readGoods_missingFile_emptyList() throws IOException, DataLoadingException {
        Optional<List<GoodsReceipt>> goods = csvGoodsStorage.readGoods(Paths.get("NonExistentFile.csv"));
        assertTrue(goods.isEmpty());
    }

    @Test
    public void readGoods_invalidCsvFormat_throwsException() throws IOException {
        // TODO: Implement this
    }

    @Test
    public void readGoods_validCsv_success() throws IOException {
        // TODO: Implement this
    }
}
