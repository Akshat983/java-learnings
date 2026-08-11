Set-Location "C:\code\JavaByKK"

git add .

$files = git diff --cached --name-only

if (-not $files) {
    exit
}

$folders = $files |
    ForEach-Object { ($_ -split '[\\/]')[0] } |
    Where-Object { $_ -ne "" } |
    Sort-Object -Unique

if ($folders.Count -eq 1) {
    $message = "Update $($folders[0])"
}
elseif ($folders.Count -le 3) {
    $message = "Update " + ($folders -join ", ")
}
else {
    $message = "Update Java & DSA practice"
}

git commit -m "$message"

git push