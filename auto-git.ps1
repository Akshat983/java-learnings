Set-Location "C:\code\JavaByKK"

git add .

if (git diff --cached --quiet) {
    exit
}

$time = Get-Date -Format "dd-MM-yyyy HH:mm"

git commit -m "Auto update - $time"

git push