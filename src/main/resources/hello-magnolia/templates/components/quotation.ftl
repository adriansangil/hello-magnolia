[#if model.getQuote()?has_content]
[#assign quote = model.getQuote()]
<div class="row">
   <div class="col-md-12">
      <div class="panel panel-primary">
        
         <div class="panel-heading clearfix">
            <div class="panel-title pull-right"><small>${quote.title} - ${quote.date }</small></div>
            <div class="panel-title">${quote.category}</div>
            <div class="clearfix"></div>
         </div>
         <div class="panel-body">
            <div class="row">
               <div class="col-md-6">
                  <img src="${quote.background}" class="img-responsive" alt="Responsive image">
               </div>
               <div class="col-md-6">
                  <blockquote class="blockquote-reverse">
                     <p>${quote.quote}</p>
                     <footer><cite title="Source Title">${quote.author}</cite></footer>
                  </blockquote>
               </div>
            </div>
         </div>
         <div class="panel-footer panel-primary text-right">
            [#list quote.tags as tag]
                <span class="label label-primary">${tag}</span>
            [/#list]
         </div>
         <!--.panel-footer-->
         
      </div>
   </div>
</div>
[/#if]
