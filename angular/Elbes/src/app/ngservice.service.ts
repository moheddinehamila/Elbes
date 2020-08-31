import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import {Article} from './article';

@Injectable({
  providedIn: 'root'
})
export class NgserviceService {

  constructor(private _http:HttpClient ) { }
  ArticleList():Observable<any>{
    return this._http.get("http://localhost:8081/hamdi/article"); 
  }
  addArticle(article:Article ):Observable<any>{
    return this._http.put<any>("http://localhost:8081/hamdi/article",article); 
  }
  deleteArticle(article:Article ):Observable<any>{
    var url ="http://localhost:8081/hamdi/article/delete/"; 
     let id=article.idarticle; 
    return this._http.delete(url+id , { responseType: "text" }); 
    
  }
  updateArticle(article :Article):Observable<any>{
    return this._http.put<any>("http://localhost:8081/hamdi/article/update",article)
  }
  getarticlebyid( id: number):Observable<any>{
    return this._http.get<any>("http://localhost:8081/hamdi/article/"+id)
  } 
}
