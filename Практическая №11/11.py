import tkinter as tk
import requests
import json
def f():
    r_name=r_name_entry.get()
    url = f'https://api.github.com/users/{r_name}'
    response = requests.get(url)
    if response.status_code == 200:
        d=response.json()
        result={'company':d.get('company'),'created_at':d.get('created_at'),'email':d.get('email'),'id':d.get('id'),'name':d.get('login'),'url':d.get('url'),}
        with open('repo_info.json', 'w') as json_f:
            json.dump(result,json_f)
        output_label.config(text="Информация получена и сохранена в repo_info.json.")
    else:
        output_label.config(text="Ошибка: Репозиторий не найден.")
app=tk.Tk()
app.title("GitHub R Info")
r_name_entry=tk.Entry(app)
r_name_entry.pack()
fetch_button=tk.Button(app,text="Получить информацию", command=f)
fetch_button.pack()
output_label = tk.Label(app,text="")
output_label.pack()
app.mainloop()
