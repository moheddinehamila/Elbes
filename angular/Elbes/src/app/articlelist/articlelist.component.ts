import { Component, OnInit } from '@angular/core';
import {NgserviceService} from '../ngservice.service' ; 
import {Article} from '../article';
import { Router } from '@angular/router';
@Component({
  selector: 'app-articlelist',
  templateUrl: './articlelist.component.html',
  styleUrls: ['./articlelist.component.css']
})
export class ArticlelistComponent implements OnInit {
  _articlelist: Article[]; 
  constructor(private _service:NgserviceService,private _route:Router) { }
w
  ngOnInit(): void {
    this._service.ArticleList().subscribe(
      data=>{console.log("ok read")
    this._articlelist=data; 
    
    
    },
      error=>console.log("erreur ")
      
    )

  }
  add_aritcle(){
    this._route.navigate(['/addaricle']); 
  }
  updatearticle(article: Article){
    console.log(article);
    this._route.navigate(['/updatearticle',article.idarticle]); 
  }



  Delete_article(article : Article){
  console.log(article.idarticle); 
      
    this._service.deleteArticle(article).subscribe (
      data=>{
        console.log("date deleted ");
       this.ngOnInit();
      });  
        
    }
    
         
  

  
  }
 



