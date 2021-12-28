# Menghapus semua file yang sudah tercompile
rm -r */*/*/*.class && echo "Test 1 Passed"
sleep 1

# Temukan semua file .java dan kemudian masukan ke sources.txt
find -name "*.java" > src/test/executeble/sources.txt && echo "Test 2 Passed"

sleep 1
# Compile semua file java yang sebelum nya sudah terkumpul di sorces.txt
javac @src/test/executeble/sources.txt && echo "Test 3 Passed"

sleep 1
# Temukan semua file yang sudah di compile lalu kemudian masukan ke sources.txt
find -name "*.class" > src/test/executeble/sources.txt && echo "Test 4 Passed"

sleep 1
# Membuat executeble jar file
jar cvfm src/test/executeble/main.jar src/test/manifest/manifest.txt @src/test/executeble/sources.txt && echo "Test 5 Passed"

sleep 1
# Print isi dari jar
jar tf src/test/executeble/main.jar && echo "Test 6 Passed"

sleep 1
# run jar
echo "Now Print The Output ......."
sleep 3
java -jar src/test/executeble/main.jar
