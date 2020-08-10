# Set path to custom logo (a gif in this case)
logo <- "https://raw.githubusercontent.com/matt-dray/rostrum-blog/master/static/images/favicon.gif"

# Set underlying badge link (where the badge-click will take you)
link <- "https://www.rostrum.blog/"

blog_badge <- badgr::get_badge(
  label = "rostrum.blog",   # left-side text
  message = "post",         # right-side text
  color = "008900",         # left-side colour (green)
  label_color = "black",    # right_side colour
  md_link = link,           # where to go when clicked
  logo_path = logo,         # path to my logo
  browser_preview = FALSE,  # don't open preview
  to_clipboard = FALSE      # don't copy to clipboard
)
