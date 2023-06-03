package OOP_Les2.Ex006.Interface;

import OOP_Les2.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
