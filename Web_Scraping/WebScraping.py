import requests
from bs4 import BeautifulSoup
import pandas as pd

nm_list=[]
pr_list=[]
ds_list=[]
rw_list=[]

url="https://www.airbnb.co.in/s/Bengaluru--India/homes?place_id=ChIJbU60yXAWrjsR4E9-UejD3_g&refinement_paths%5B%5D=%2Fhomes"
r = requests.get(url)

soup = BeautifulSoup(r.text,"lxml")
cout=0
try:
    while True and cout<=10:
        name = soup.find_all("div",{"class":"t1jojoys atm_g3_1kw7nm4 atm_ks_15vqwwr atm_sq_1l2sidv atm_9s_cj1kg8 atm_6w_1e54zos atm_fy_1vgr820 atm_7l_jt7fhx atm_cs_10d11i2 atm_w4_1eetg7c atm_ks_zryt35__1rgatj2 dir dir-ltr"})
        for i in name:
            n = i.text
            nm_list.append(n)
            # print(nm_list)
        
        price = soup.find_all("div",{"class":"pquyp1l atm_da_cbdd7d pi11895 atm_h3_lh1qj6 dir dir-ltr"})
        for i in price:
            n = i.text
            pr_list.append(n)
            # print(pr_list)

        # dr = soup.find_all("div",{"class":"fb4nyux atm_da_cbdd7d s1cjsi4j atm_sq_1l2sidv atm_6w_1e54zos atm_fy_kb7nvz atm_7l_1he744i sgdvnt3 atm_9s_1txwivl atm_ar_vrvcex atm_be_1g80g66 atm_g3_8onn7m atm_iy_8onn7m atm_ks_15vqwwr dir dir-ltr"})
        # for i in dr:
        #     n = i.text
        #     ds_list.append(n)
        #     # print(ds_list)
        
        rw = soup.find_all("div",{"class":"t1a9j9y7 atm_da_1ko3t4y atm_dm_kb7nvz atm_fg_h9n0ih dir dir-ltr"})
        for i in rw:
            n = i.text
            rw_list.append(n)
            # print(rw_list)

        np = soup.find("a",{"aria-label":"Next"}).get("href")
        print(np)
        cnp = "https://www.airbnb.co.in" + np

        url=cnp
        r = requests.get(url)
        soup = BeautifulSoup(r.text,'lxml')
except:
    pass

df = pd.DataFrame({"Name":nm_list,"Prices":pr_list,"Review":rw_list})

df.to_csv('airbnbBangalore.csv')
