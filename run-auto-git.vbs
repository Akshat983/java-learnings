Set shell = CreateObject("WScript.Shell")
shell.Run "powershell.exe -NoProfile -ExecutionPolicy Bypass -File ""C:\code\JavaByKK\auto-git.ps1""", 0, True
Set shell = Nothing